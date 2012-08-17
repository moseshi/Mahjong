package mahjong.system;

public class Mahjong {
	public static void main(){
		Field field = new Field(4);
		field.chipai(4);
		field.renchan();
		field.ryukyoku();	
	}
}
