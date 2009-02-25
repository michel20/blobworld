package cs.stand.ac.uk.cs3099.site;

public class SiteInfo implements ISiteInfo
{
	private double count, beauty, charm, goodness, 
		health, knowledge, wealth;
	
	public double getBlobCount() 					{ return count; 				}
	public void setBlobCount( double count ) 		{ this.count = count; 			}
	
	public double getBeauty() 						{ return beauty; 				}
	public void setBeauty( double beauty ) 			{ this.beauty = beauty; 		}
	
	public double getCharm() 						{ return charm; 				}
	public void setCharm( double charm ) 			{ this.charm = charm; 			}
	
	public double getGoodness() 					{ return goodness; 				}
	public void setGoodness( double goodness ) 		{ this.goodness = goodness; 	}
	
	public double getHealth() 						{ return health; 				}
	public void setHealth( double health ) 			{ this.health = health; 		}
	
	public double getKnowledge() 					{ return knowledge; 			}
	public void setKnowledge( double knowledge ) 	{ this.knowledge = knowledge; 	}
	
	public double getWealth() 						{ return wealth; 				}
	public void setWealth( double wealth ) 			{ this.wealth = wealth; 		}
	
	public SiteInfo()
	{
		
	}
}
