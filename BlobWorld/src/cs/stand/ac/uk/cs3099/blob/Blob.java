package cs.stand.ac.uk.cs3099.blob;

public class Blob implements IBlob
{
	private String id;
	private int tickOfBirth;
	private double beauty, charm, goodness, 
		health, knowledge, wealth;
	
	public String getId() 							{ return id; 						}
	public void setId( String id )					{ this.id = id;						}
	
	public double getBeauty() 						{ return beauty; 					}
	public void setBeauty( double beauty ) 			{ this.beauty = beauty; 			}
	
	public double getCharm() 						{ return charm; 					}
	public void setCharm( double charm ) 			{ this.charm = charm; 				}
	
	public double getGoodness() 					{ return goodness; 					}
	public void setGoodness( double goodness ) 		{ this.goodness = goodness; 		}
	
	public double getHealth() 						{ return health; 					}
	public void setHealth( double health ) 			{ this.health = health; 			}
	
	public double getKnowledge() 					{ return knowledge; 				}
	public void setKnowledge( double knowledge ) 	{ this.knowledge = knowledge;		}
	
	public double getWealth() 						{ return wealth; 					}
	public void setWealth( double wealth ) 			{ this.wealth = wealth; 			}
	
	public int getTickOfBirth()						{ return tickOfBirth;				}
	public void setTickOfBirth( int tickOfBirth )	{ this.tickOfBirth = tickOfBirth;	}
	
	public Blob()
	{
		
	}
}
