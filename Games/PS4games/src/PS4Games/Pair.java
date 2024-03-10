package PS4Games;

import java.util.Objects;

public class Pair<X,Y> {
    
    public X first;
    public Y second;
    
    public Pair(X first, Y second){
    	this.first = first;
    	this.second = second;
    }
    
    public X getFirst(){
    	return this.first;
    }
    
    public Y getSecond(){
    	return this.second;
    }
    
    public String toString(){
    	return "- "+this.first+this.second;
    }

    @Override
    public boolean equals(Object o) {
    	if (o == this)
    		return true;
    	if (o == null) 
    		return false;
    	if (this.getClass() != o.getClass())
    		return false;
    	
    	Pair other = (Pair)o;
    	return(Objects.equals(this.first, other.first) && 
    		   Objects.equals(this.second, other.second));
    }

    
} 
