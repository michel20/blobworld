package cs.stand.ac.uk.cs3099.blob;

public interface IBlob
{
	public String getId();
	public void setId( String id );
	
	public double getBeauty();
	public void setBeauty( double beauty );
	
	public double getCharm();
	public void setCharm( double charm );
	
	public double getGoodness();
	public void setGoodness( double goodness );
	
	public double getHealth();
	public void setHealth( double health );
	
	public double getKnowledge();
	public void setKnowledge( double knowledge );
	
	public double getWealth();
	public void setWealth( double wealth );
	
	public int getTickOfBirth();
	public void setTickOfBirth( int tickOfBirth );
}
