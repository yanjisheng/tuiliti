package yjs.tuili;

public class Q5 implements Question {

	private static byte answer;
	
	@Override
	public void setAnswer(byte answer) {
		// TODO Auto-generated method stub
		if(answer>=1&&answer<=4){
			this.answer=answer;
		}
	}

	@Override
	public byte getAnswer() {
		// TODO Auto-generated method stub
		return this.answer;
	}

	@Override
	public boolean isCorrectAnswer() {
		// TODO Auto-generated method stub
		//5.以下选项中哪一题的答案与本题相同
		//A.第8题 B.第4题 C.第9题 D.第7题
		boolean result = false;
		byte q8answer = (new Q8()).getAnswer();
		byte q4answer = (new Q4()).getAnswer();
		byte q9answer = (new Q9()).getAnswer();
		byte q7answer = (new Q7()).getAnswer();
		if((this.answer==1&&(q8answer==this.answer))||
				(this.answer==2&&(q4answer==this.answer))||
				(this.answer==3&&(q9answer==this.answer))||
				(this.answer==4&&(q7answer==this.answer))){
			result = true;
		}
		return result;
	}

}
