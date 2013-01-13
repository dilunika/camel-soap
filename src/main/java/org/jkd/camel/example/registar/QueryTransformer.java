package org.jkd.camel.example.registar;

import org.apache.camel.Handler;
import org.apache.camel.language.Simple;

public class QueryTransformer {
	
	@Handler
	public String transform(final @Simple("body[0]") String nic){
		
		return "from Student where nic=" + nic;
	}

}
