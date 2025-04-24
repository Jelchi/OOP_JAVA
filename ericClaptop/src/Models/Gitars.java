package Models;

public class Gitars {
	private String type; 
	private Integer switchPosition; 
	private Integer volumeControl; 
	private Integer toneControl; 
	private String soundType; 
	
	public Gitars(String type, Integer switchPosition, Integer volumeControl, Integer toneControl, String soundType) {
		super();
		this.type = type;
		this.switchPosition = switchPosition;
		this.volumeControl = volumeControl;
		this.toneControl = toneControl;
		this.soundType = soundType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getSwitchPosition() {
		return switchPosition;
	}

	public void setSwitchPosition(Integer switchPosition) {
		this.switchPosition = switchPosition;
	}

	public Integer getVolumeControl() {
		return volumeControl;
	}

	public void setVolumeControl(Integer volumeControl) {
		this.volumeControl = volumeControl;
	}

	public Integer getToneControl() {
		return toneControl;
	}

	public void setToneControl(Integer toneControl) {
		this.toneControl = toneControl;
	}

	public String getSoundType() {
		return soundType;
	}

	public void setSoundType(String soundType) {
		this.soundType = soundType;
	}
	
	
	
	
}
