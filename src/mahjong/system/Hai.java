package mahjong.system;

public class Hai {
	boolean aka;
	HaiType type;
	
	public Hai(HaiType type, boolean aka){
		this.type = type;
		this.aka = aka;
	}
	
	public void sss(){
		aka = true;
	}
	
	
	public HaiType getType(){		
		return type;
	}
	
	
	boolean isRed(boolean aka){
		if(aka == true){
			return true;
		}
		return  false;
	}
}
