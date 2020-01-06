package main3.products;
public class Software extends Product
{
	private String version;

        public Software()
        {
               version ="";
                
        }

        public void setVersion(String version )
        {
                this.version=version;
        }

        public String toString()
        {
                return super.toString() +"Version:    "+version+"\n";
        }
}

