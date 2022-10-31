class Student extends Person {
	private String program;
	private int yearLevel;
	
	public void setProgram(String p){
		this.program = p;
	}
	public String getProgram(){
		return program;
	}
	public void setYearLevel(String y){
		this.yearLevel = Integer.parseInt(y);
	}
	public int getYearLevel(){
		return yearLevel;
	}
}