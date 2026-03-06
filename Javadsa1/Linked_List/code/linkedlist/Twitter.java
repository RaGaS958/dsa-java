package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
    private User head_user;
    private int user_num;
    public void Twitter()
    {
        this.user_num=0;
    }
    public void addUser(int userID,String name)
    {
        User user =new User(userID,name);
        if(head_user==null) {
            head_user = user;
            System.out.println("User created");
            user_num++;
            return;
        }
        user.nextUser=head_user;
        head_user=user;
        System.out.println("User created");
        user_num++;
    }

    public void postTweet(int postId,int userID,String tweet)
    {
        Post post=new Post(userID, postId,tweet);
        User temp=head_user;
        while(temp!=null)
        {
            if(temp.userID==userID)
            {
                break;
            }
            temp=temp.nextUser;
        }
        if(temp==null)
        {
            System.out.println("User not found");
            return;
        }

        if(temp.posts==null)
        {
            temp.posts=post;
            temp.numPost=temp.numPost+1;
            System.out.println("Post created");
            return;
        }
        post.nextPost=temp.posts;
        temp.posts=post;
        temp.numPost=temp.numPost+1;
        System.out.println("Post created");
    }

    public List<Integer> getNewsFeed(int userID )
    {
        List<Integer> list =new ArrayList<>();
        User temp=head_user;
        while(temp!=null)
        {
            if(temp.userID==userID)
            {
                break;
            }
            temp=temp.nextUser;
        }
        if(temp==null)
        {
            System.out.println("User not found");
            return list;
        }
        Post head=temp.posts;
        if(head==null)
        {
            System.out.println("no post");
            return list;
        }
        while(head!=null)
        {
            list.add(head.postID);
            head=head.nextPost;
        }
        return list;
    }

    private void follow(int followerId ,int followingId )
    {
        User temp_follower=head_user;
        User temp_following=head_user;

        while(temp_follower!=null)
        {
            if(temp_follower.userID==followerId)
            {
                break;
            }
            temp_follower=temp_follower.nextUser;
        }
        if(temp_follower==null)
        {
            System.out.println("User not found");
            return;
        }

        while(temp_following!=null)
        {
            if(temp_following.userID==followingId)
            {
                break;
            }
            temp_following=temp_following.nextUser;
        }
        if(temp_following==null)
        {
            System.out.println("User not found");
            return;
        }

        temp_follower.following.add(temp_following.userID);
        System.out.println(temp_follower.name +" follows "+temp_following.name);


    }private void unfollow(int followerId ,int followingId )
    {
        User temp_follower=head_user;
        User temp_following=head_user;

        while(temp_follower!=null)
        {
            if(temp_follower.userID==followerId)
            {
                break;
            }
            temp_follower=temp_follower.nextUser;
        }
        if(temp_follower==null)
        {
            System.out.println("User not found");
            return;
        }

        int len=temp_follower.following.size();
        for(int i=0;i<len;i++)
        {
            if(temp_follower.following.get(i)==followingId)
            {
                temp_follower.following.remove(i);
                System.out.println(temp_follower.name +" unfollows "+temp_following.name);
                return;

            }
        }
        System.out.println("No user found with following id"+followingId);

    }

    public void displayUser()
    {
        if(head_user==null)
        {
            System.out.println("No user");
            return;
        }
        User temp=head_user;
        System.out.println("HEAD -->");
        while(temp!=null)
        {
            System.out.println("[["+temp.userID+"]["+temp.name+"][ num of posts:-"+temp.numPost+"][follows:-"+temp.following+"]]");
            temp=temp.nextUser;
        }
    }

    private class User
    {
        private int userID;
        private int numPost;
        private String name;
        private List<Integer> following ;
        private User nextUser;
        private Post posts;
      private User(int userID,String name )
        {
            this.userID=userID;
            this.name=name;
            this.numPost=0;
        }
        private User(int val,User nextUser )
        {
            this.userID=val;
            this.nextUser=nextUser;
            this.numPost=0;

        }

    }



    private class Post
    {
        private int postID;
        private int userID;
        private String tweet;
        private Post nextPost;
        private Post(int userID,int postID,String tweet)
        {
            this.userID=userID;
            this.tweet=tweet;
            this.postID=postID;
        }
        private Post (int val,Post nextPost )
        {
            this.userID=val;
            this.postID=postID;
            this.nextPost=nextPost;
         }
    }


}
