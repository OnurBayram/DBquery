String sinif=request.getParameter("sinif");
        String nadir=request.getParameter("nadir");
        String paket=request.getParameter("paket");
        String mana=request.getParameter("mana");
        String isim=request.getParameter("isim");
        
        List<String> aramaL =new ArrayList<String>();
        String sqlPlus="";
    	
        if(sinif.equals("1"))
	        {
	        	//do nothing
	        }
        else
	        {
	        	sinif= "sinif='" + sinif+ "'";		        	
	        	aramaL.add(sinif);
	        }
    
        if(nadir.equals("1"))
	        {
	        	//do nothing
	        }
        else
	        {
	        	nadir="nadir='"+nadir+ "'";
	        	aramaL.add(nadir);
	        }
        if(paket.equals("1"))
	        {
	        	//do nothing
	        }
        else
	        {
	        	paket="paket='"+paket+ "'";
	        	aramaL.add(paket);
	        }
        if(mana.equals("55"))
	        {
	        	//do nothing
	        }
        else
	        {
	        	mana="mana="+mana;
	        	aramaL.add(mana);
	        }
        if(isim.equals("isim"))
	        {
	        	//do nothing
	        }
        else
	        {
        		isim=isim.toUpperCase();
	        	isim= "isim LIKE '%" + isim + "%'";		        	
	        	aramaL.add(isim);
	        }
        
        int counter=0;
        while(counter<aramaL.size())
        {
	        	if(counter!=0)
		        	{	
	        		sqlPlus += " AND ";
	        		
	        		sqlPlus += aramaL.get(counter);
	        		sqlPlus += " ";
	        			
		        	}
		        else if(counter==0)
		        	{
		        	sqlPlus +="where";
        			sqlPlus += " ";
        			
        			sqlPlus += aramaL.get(counter);
        			sqlPlus += " ";
		        	}

        	counter++;
        }
