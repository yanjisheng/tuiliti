package yjs.tuili;

//����ӿڣ�ÿ����Ŀһ��ʵ����
interface Question {
	
	void setAnswer(byte answer);
	
	byte getAnswer();
	
	boolean isCorrectAnswer();
}
