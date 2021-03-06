package eu.heliovo.dpas.ie.services.directory.transfer;

import java.io.Writer;

import eu.heliovo.dpas.ie.services.common.transfer.CommonTO;


public class DirDataTO extends CommonTO{
	
	private boolean providerStatus;	
	private String fileId;
	private String provider;
	
	private Writer output;
	
	public void setOutput(Writer output) {
		this.output = output;
	}

	public Writer getOutput() {
		return output;
	}

	public boolean isProviderStatus() {
		return providerStatus;
	}

	public void setProviderStatus(boolean providerStatus) {
		this.providerStatus = providerStatus;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}
}
