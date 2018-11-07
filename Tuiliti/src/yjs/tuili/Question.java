package yjs.tuili;

//问题接口，每道题目一个实现类
interface Question {
	
	void setAnswer(byte answer);
	
	byte getAnswer();
	
	boolean isCorrectAnswer();
}
