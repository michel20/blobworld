package cs.stand.ac.uk.cs3099.site;

import cs.stand.ac.uk.cs3099.blob.IBlob;

public interface ISite
{
	public ISiteInfo getSiteInfo();
	
	public void receive( IBlob blob );
	
	public IBlob sendBack( String id );
}
