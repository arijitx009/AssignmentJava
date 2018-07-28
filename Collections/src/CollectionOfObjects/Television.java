package CollectionOfObjects;
//class which implements television
public class Television {
	
		
		//Instance members
		private String company;
		private String type;
		private boolean enable3d;
		private int price;
		
		public Television(String company,String type,boolean enable3d,int price)
		{
			this.company=company;
			this.type=type;
			this.enable3d=enable3d;
			this.price=price;
		}

		public String getCompany() {
			return company;
		}

		public String getType() {
			return type;
		}

		public boolean isEnable3d() {
			return enable3d;
		}

		public int getPrice() {
			return price;
		}
		
		

			}


