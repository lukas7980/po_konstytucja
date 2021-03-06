package konstytucja;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Chapter {
    public int number;
    public String title;
    public ArrayList<Article> articles;

    public Chapter(int number, String title, ArrayList<Article> article_set){
        this.number=number;
        this.title=""+title;
        this.articles=article_set;
    }
    @Override
    public String toString(){
        String output= "";
        output += this.title + " " + this.number + "\n";
        for(Article a: this.articles) {

            output += "\n" + a.toString();
        }
        return output;
    }
    public String getTitle(){
        return this.title;
    }
    public String getToC(){
        String output="";
        output+=this.title+"\n";
        for(Article a: this.articles){
            output+=a.getTitle();
        }
        return output;
    }
}
