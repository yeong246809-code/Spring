package org.example.Service;

import org.springframework.stereotype.Component;

@Component
public class ArticleService {

    public void register(){
        System.out.println("--------------");
        System.out.println("핵심기능 - register");
        System.out.println("--------------");
    }
    public void getArticle(String ano){
        if(ano.equals("13")){
            System.out.println("핵심기능 - getArticle");
        }
    }
    public void getArticleAll(){
        System.out.println("핵심기능 - getArticleAll");
    }
    public void modify(){
        System.out.println("핵심기능 - modify");
    }
    public void delete(){
        System.out.println("핵심기능 - delete");
    }

}
