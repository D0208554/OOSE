import java.util.*;
public class testPaper implements Questionlist {
	private List<Questionlist> list = new ArrayList<Questionlist>();
	public void add(Questionlist questionlist){
		list.add(questionlist);
	}
	public void print(){
		for(Questionlist questionlist : list){
			questionlist.print();
	    }
	}
}