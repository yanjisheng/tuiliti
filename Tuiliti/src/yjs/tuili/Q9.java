package yjs.tuili;

public class Q9 implements Question {

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
		//9.已知“第1题与第6题的答案相同”与“第X题与第5题的答案相同”的真假性相反，那么X为
		//A.6 B.10 C.2 D.9
		boolean result = false;
		byte q1answer = (new Q1()).getAnswer();
		byte q6answer = (new Q6()).getAnswer();
		boolean q1EqualsQ6 = q1answer==q6answer;
		byte q5answer = (new Q5()).getAnswer();
		byte q10answer = (new Q10()).getAnswer();
		byte q2answer = (new Q2()).getAnswer();
		byte q9answer = (new Q9()).getAnswer();
		if((this.answer==1&&(q1EqualsQ6!=(q5answer==q6answer)))||
				(this.answer==2&&(q1EqualsQ6!=(q5answer==q10answer)))||
				(this.answer==3&&(q1EqualsQ6!=(q5answer==q2answer)))||
				(this.answer==4&&(q1EqualsQ6!=(q5answer==q9answer)))){
			result = true;
		}
		return result;
	}

}
