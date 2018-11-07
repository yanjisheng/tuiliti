package yjs.tuili;

public class Q8 implements Question {

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
		//8.以下选项中哪一题的答案与第1题的答案在字母中不相邻
		//A.第7题 B.第5题 C.第2题 D.第9题
		boolean result = false;
		byte q1answer = (new Q1()).getAnswer();
		byte q7answer = (new Q7()).getAnswer();
		byte q5answer = (new Q5()).getAnswer();
		byte q2answer = (new Q2()).getAnswer();
		byte q9answer = (new Q9()).getAnswer();
		if((this.answer==1&&!isNeighboring(q1answer,q7answer))||
				(this.answer==2&&!isNeighboring(q1answer,q5answer))||
				(this.answer==3&&!isNeighboring(q1answer,q2answer))||
				(this.answer==4&&!isNeighboring(q1answer,q9answer))){
			result = true;
		}
		return result;
	}
	
	private boolean isNeighboring(byte answer1, byte answer2){
		boolean result = false;
		if((answer1==1&&answer2==2)||(answer1==2&&answer2==1)||
				(answer1==2&&answer2==3)||(answer1==3&&answer2==2)||
				(answer1==3&&answer2==4)||(answer1==4&&answer2==3)){
			result = true;
		}
		return result;
	}

}
