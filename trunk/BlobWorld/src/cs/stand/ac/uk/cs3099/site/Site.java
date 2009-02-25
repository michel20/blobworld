package cs.stand.ac.uk.cs3099.site;

import cs.stand.ac.uk.cs3099.blob.IBlob;

import java.util.HashMap;

public class Site implements ISite
{
	private ISiteInfo siteInfo;
	private HashMap<String, IBlob> blobs;

	public ISiteInfo getSiteInfo() { return siteInfo; }
	
	public Site()
	{
		blobs = new HashMap<String, IBlob>();
	}
	
	public void receive( IBlob blob )
	{
		blobs.put( blob.getId(), blob );
	}
	
	public IBlob sendBack( String id )
	{
		IBlob blob = blobs.get( id );
		
		return blob;
	}
}
