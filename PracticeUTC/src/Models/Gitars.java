package Models;

public class Gitars {
	private String gitarType; 
	private String soundType; 
	private Integer toneControl; 
	private Integer volumeControl; 
	private Integer switchPosition; 
	
	public Gitars(String gitarType, String soundType, Integer toneControl, Integer volumeControl, Integer switchPosition) {
		super(); 
		this.gitarType = gitarType; 
		this.soundType = soundType; 
		this.toneControl = toneControl; 
		this.volumeControl = volumeControl; 
		this.switchPosition = switchPosition; 
	}

	public String getGitarType() {
		return gitarType;
	}

	public void setGitarType(String gitarType) {
		this.gitarType = gitarType;
	}

	public String getSoundType() {
		return soundType;
	}

	public void setSoundType(String soundType) {
		this.soundType = soundType;
	}

	public Integer getToneControl() {
		return toneControl;
	}

	public void setToneControl(Integer toneControl) {
		this.toneControl = toneControl;
	}

	public Integer getVolumeControl() {
		return volumeControl;
	}

	public void setVolumeControl(Integer volumeControl) {
		this.volumeControl = volumeControl;
	}

	public Integer getSwitchPosition() {
		return switchPosition;
	}

	public void setSwitchPosition(Integer switchPosition) {
		this.switchPosition = switchPosition;
	}
	
	
}
