public class Moovment{

	public boolean moov_up(Level lvl, int border1, int border2){
		if ((lvl.getY()-1 >= border2) && (lvl.getY()-1 <= border1) && lvl.getLvl()[lvl.getY()-1][lvl.getX()] != '#'){
			lvl.setY(lvl.getY() - 1);
			lvl.setLvl(lvl.getLvl());
			lvl.print_map(lvl.getLvl());
			lvl.count_Stars();
			return true;
		}
		else{
			lvl.setLvl(lvl.getLvl());
			lvl.print_map(lvl.getLvl());
			lvl.count_Stars();
			return false;
		}
	}

	public boolean moov_left(Level lvl, int border1, int border2){
		if ((lvl.getX()-1 >= border2) && (lvl.getX()-1 <= border1) && (lvl.getLvl()[lvl.getY()][lvl.getX()-1] != '#')){
			lvl.setX(lvl.getX() - 1);
			lvl.setLvl(lvl.getLvl());
			lvl.print_map(lvl.getLvl());
			lvl.count_Stars();
			return true;
		}
		else{
			lvl.setLvl(lvl.getLvl());
			lvl.print_map(lvl.getLvl());
			lvl.count_Stars();
			return false;
		}
	}

	public boolean moov_down(Level lvl, int border1, int border2){
		if ((lvl.getY()+1 >= border2) && (lvl.getY()+1 <= border1) && lvl.getLvl()[lvl.getY()+1][lvl.getX()] != '#'){
			lvl.setY(lvl.getY() + 1);
			lvl.setLvl(lvl.getLvl());
			lvl.print_map(lvl.getLvl());
			lvl.count_Stars();
			return true;
		}
		else{
			lvl.setLvl(lvl.getLvl());
			lvl.print_map(lvl.getLvl());
			lvl.count_Stars();
			return false;
		}
	}

	public boolean moov_right(Level lvl, int border1, int border2){
		if ((lvl.getX()+1 >= border2) && (lvl.getX()+1 <= border1) && lvl.getLvl()[lvl.getY()][lvl.getX()+1] != '#'){
			lvl.setX(lvl.getX() + 1);
			lvl.setLvl(lvl.getLvl());
			lvl.print_map(lvl.getLvl());
			lvl.count_Stars();
			return true;
		}
		else{
			lvl.setLvl(lvl.getLvl());
			lvl.print_map(lvl.getLvl());
			lvl.count_Stars();
			return false;
		}
	}

}