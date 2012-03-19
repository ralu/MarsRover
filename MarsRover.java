public class MarsRover{
	
	int xCordinate,yCordinate;
	char direction;
	static char LEFT = 'L';
	static char RIGHT = 'R';
	static char MOVE = 'M';
	static char NORTH = 'N';
	static char SOUTH = 'S';
	static char EAST = 'N';
	static char WEST = 'W';	
	
	MarsRover(int x, int y, char dir){
		xCordinate=x;
		yCordinate=y;
		direction=dir;
	}	
	
	public void execute(String instruction){
		char instructionChar;
			String possition = getPosition();
		for(int i=0;i<instruction.length();i++){
			instructionChar = instruction.charAt(i);
			switch(instructionChar){
			case 'L' : setDirection(LEFT);break;
			case 'R' : setDirection(RIGHT);break;
				case 'M' : move();break;
			default : System.out.println("Not a correct Input !!");
			}			
		}	
	}

	public String getPosition(){
		String position = xCordinate+" "+yCordinate+" "+direction;
		return position;
	}
	
	private void setDirection(char dir){
		String[] splitPos ;
			splitPos = splitGetPostion(getPosition());
		if(splitPos[2].equals(NORTH+"")&& (dir==LEFT)){
			direction = WEST;
					
		}else if(splitPos[2].equals(NORTH+"")&& (dir==RIGHT)){
			direction = EAST;		
			
		}else if(splitPos[2].equals(SOUTH+"")&& (dir==LEFT)){
			direction = WEST;		
			
		}else if(splitPos[2].equals(SOUTH+"")&& (dir==RIGHT)){
			direction = EAST;
				
		}else if(splitPos[2].equals(EAST+"")&& (dir==LEFT)){
			direction = NORTH;		
			
		}else if(splitPos[2].equals(EAST+"")&&(dir==RIGHT)){
			direction = SOUTH;		
		
		}else if(splitPos[2].equals(WEST+"")&&(dir==LEFT)){
			direction = SOUTH;		
			
		}else if(splitPos[2].equals(WEST+"")&&(dir==RIGHT)){
			direction = NORTH;		
			
		}
	}
	
	private void move(){
		if(direction==NORTH){
			yCordinate +=1;
		}else if(direction == SOUTH){
				yCordinate +=1;
		}else if(direction == EAST){
			xCordinate +=1;
		}else if(direction == WEST){
			xCordinate -=1;
		}
	}
	
	private String[] splitGetPostion(String position){
		String[] split;
		split=position.split(" ");
		return split;
	}
}
