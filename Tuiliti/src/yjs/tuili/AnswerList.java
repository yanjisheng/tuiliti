package yjs.tuili;

//答案列表类
public class AnswerList {
	private byte[] answers = new byte[10];
	
	public AnswerList(){
		for(byte i=1;i<=10;i++){
			answers[i-1] = 1;
		}
	}
	
	public byte get(byte i){
		byte toReturn = 0;
		if(i>=1&&i<=10){
			toReturn = answers[i-1];
		}
		return toReturn;
	}
	
	public boolean next(){
		boolean result = true;
		for(byte i=1;i<=10;i++){
			if(answers[10-i]==4){
				answers[10-i] = 1;
				if(i==10){
					result = false;
				}
			}else{
				answers[10-i]++;
				break;
			}
		}
		return result;
	}
}
