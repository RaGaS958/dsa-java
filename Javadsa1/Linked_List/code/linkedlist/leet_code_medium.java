package linkedlist;

import java.util.ArrayList;

public class leet_code_medium {

    public static void main(String[] args) {


  //-----------------------------------------------------------------------------------------------------------------
 // question:-https://leetcode.com/problems/design-twitter/description/
// ------------------------------------------------------------------------------------------------------------------

//        Twitter obj=new Twitter();
//        obj.addUser(1,"Sagar");
//        obj.addUser(2,"Pushkar");
//        obj.addUser(3,"Nancy");
//        obj.addUser(4,"adarsh");
//        obj.addUser(5,"shreya");
//        // Tweets
//        obj.postTweet(101,1,"Hi everyone!");
//        obj.postTweet(102,2,"Learning Java linked lists.");
//        obj.postTweet(103,3,"Good morning!");
//        obj.postTweet(104,4,"Just finished coding practice.");
//        obj.postTweet(105,5,"Working on my DSA project.");
//
//More tweets
//        obj.postTweet(106,1,"Today I solved 5 problems.");
//        obj.postTweet(107,3,"Coffee and coding.");
//        obj.postTweet(108,2,"Debugging a tricky bug.");
//        obj.postTweet(109,5,"Frontend integration done.");
//        obj.postTweet(110,4,"System design study time.");
//
// Multiple tweets from same user
//        obj.postTweet(111,1,"Another tweet from Sagar.");
//        obj.postTweet(112,1,"Testing tweet system.");
//        obj.postTweet(113,2,"Java is fun.");
//        obj.postTweet(114,3,"Working on assignments.");
//        obj.postTweet(115,5,"Learning new frameworks.");
//
//
//        obj.displayUser();
//
//
//        System.out.println(obj.getNewsFeed(5));

//-----------------------------------------------------------------------------------------------------------------

        // question:-https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/

//        singly_list list=new singly_list();
//        list.insertFirstnotail(6);
//        list.insertFirstnotail(5);
//       list.insertFirstnotail(4);
//        list.insertFirstnotail(3);
//       list.insertFirstnotail(2);
//       list.insertFirstnotail(1);
//       list.displays();
//       list.Swaps(1);
//        list.displays();


//-----------------------------------------------------------------------------------------------------------------

        // question:-https://leetcode.com/problems/add-two-numbers/description/

//        singly_list list=new singly_list();
//        list.insertFirstnotail(9);
//        list.insertFirstnotail(9);
//        list.insertFirstnotail(9);
//        list.insertFirstnotail(9);
//        list.insertFirstnotail(9);
//        list.insertFirstnotail(9);
//        list.insertFirstnotail(9);
//        list.displays();
//        singly_list list1=new singly_list();
//        list1.insertFirstnotail(9);
//        list1.insertFirstnotail(9);
//        list1.insertFirstnotail(9);
//        list1.insertFirstnotail(9);
//        list1.displays();
//        singly_list res=list.addTwoList(list1);
//        res.displays();



//-----------------------------------------------------------------------------------------------------------------

        // question:-https://leetcode.com/problems/add-two-numbers-ii/description/

//        singly_list list=new singly_list();
//        list.insertFirstnotail(3);
//        list.insertFirstnotail(4);
//        list.insertFirstnotail(2);
//        list.insertFirstnotail(7);
//        list.displays();
//        singly_list list1=new singly_list();
//        list1.insertFirstnotail(4);
//        list1.insertFirstnotail(6);
//        list1.insertFirstnotail(5);
//        list1.displays();
//        singly_list res=list.addTwoListRight(list1);
//        res.displays();


// ------------------------------------------------------------------------------------------------------------

        //questions:-https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/description/


//        doubly_list list=new doubly_list();
//        list.insertLast(1);
//        list.insertLast(2);
//        list.insertLast(3);
//        list.insertLast(4);
//        list.insertLast(5);
//        list.insertLast(6);
//        list.display();
//
//        doubly_list list1=new doubly_list();
//
//        list1.insertLast(7);
//        list1.insertLast(8);
//        list1.insertLast(9);
//        list1.insertLast(10);
//        list1.display();
//
//        doubly_list list2=new doubly_list();
//        list2.insertLast(11);
//        list2.insertLast(12);
//        list2.display();
//
//        list.creatingchild(list1,list2,3,2);
//        list.flatten();
//        list.display();

// ------------------------------------------------------------------------------------------------------------

  // question:-https://leetcode.com/problems/lru-cache/description/

//        LRU cache=new LRU(2);
//        cache.put(1,1);
//        cache.displays();
//        cache.put(2,2);
//        cache.displays();
//        System.out.println(cache.get(1));
//        cache.put(3,3);
//        cache.displays();
//        System.out.println(cache.get(2));
//        cache.put(4,4);
//        cache.displays();


// ------------------------------------------------------------------------------------------------------------


  // question:-https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/description/

//        singly_list list=new singly_list();
//        list.insertFirstnotail(5);
//        list.insertFirstnotail(4);
//        list.insertFirstnotail(4);
//        list.insertFirstnotail(3);
//        list.insertFirstnotail(3);
//        list.insertFirstnotail(2);
//        list.insertFirstnotail(1);
//        list.displays();
//        list.RemoveDupSecond();
//        list.displays();

// ------------------------------------------------------------------------------------------------------------
// question:-https://leetcode.com/problems/design-browser-history/description/
//   browserHistory homepage=new browserHistory("www.google.com");
//   homepage.visits("www.facebook.com");
//   homepage.visits("www.leetcode.com");
//   homepage.visits("www.instagram.com");
//   homepage.visits("www.youtube.com");
//   homepage.visits("www.googlecolab.com");
//   homepage.visits("www.facebook.com");
//   homepage.currentUrl();
//   homepage.forward(1);
//   homepage.back(3);
//   homepage.currentUrl();
//   homepage.forward(2);
//   homepage.currentUrl();

// ------------------------------------------------------------------------------------------------------------
//
// question:-https://leetcode.com/problems/partition-list/description/

//        singly_list list=new singly_list();
//        list.insertFirstnotail(2);
//        list.insertFirstnotail(5);
//        list.insertFirstnotail(2);
//        list.insertFirstnotail(3);
//        list.insertFirstnotail(1);
//        list.insertFirstnotail(5);
//        list.displays();
//        list.partion(3);
//        list.displays();

// ------------------------------------------------------------------------------------------------------------
        // question:-https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/description/


//        singly_list list=new singly_list();
//        list.insertFirstnotail(-2);
//        list.insertFirstnotail(3);
//        list.insertFirstnotail(-3);
//        list.insertFirstnotail(2);
//        list.insertFirstnotail(1);
//        list.insertFirstnotail(-1);
//        list.displays();
//        list.removeConsecutivezero();
//        list.displays();


// ------------------------------------------------------------------------------------------------------------

        // question:-https://leetcode.com/problems/next-greater-node-in-linked-list/description/


//        singly_list list=new singly_list();
//        list.insertFirstnotail(5);
//        list.insertFirstnotail(3);
//        list.insertFirstnotail(4);
//        list.insertFirstnotail(7);
//        list.insertFirstnotail(2);
//        list.displays();
//        list.StrictlyGreater();

// ------------------------------------------------------------------------------------------------------------

        // question:-https://leetcode.com/problems/odd-even-linked-list/description/


//        singly_list list=new singly_list();
//        list.insertFirstnotail(7);
//        list.insertFirstnotail(4);
//        list.insertFirstnotail(6);
//        list.insertFirstnotail(5);
//        list.insertFirstnotail(3);
//        list.insertFirstnotail(1);
//        list.insertFirstnotail(2);
//        list.displays();
//        list.oddEven();
//        list.displays();



// ------------------------------------------------------------------------------------------------------------

        // question:-https://leetcode.com/problems/odd-even-linked-list/description/


//        singly_list list=new singly_list();
//        list.insertFirstnotail(7);
//        list.insertFirstnotail(4);
//        list.insertFirstnotail(6);
//        list.insertFirstnotail(5);
//        list.insertFirstnotail(3);
//        list.insertFirstnotail(1);
//        list.insertFirstnotail(2);
//        list.displays();
//        list.getRandom();
//        list.getRandom();
//        list.getRandom();
//        list.getRandom();
//        list.getRandom();
//        list.getRandom();
//        list.getRandom();
//        list.getRandom();
//        list.getRandom();
//        list.getRandom();
//        list.getRandom();
//        list.getRandom();
//        list.getRandom();
//        list.getRandom();
//        list.getRandom();
//        list.getRandom();

// ------------------------------------------------------------------------------------------------------------
        // question:-https://leetcode.com/problems/split-linked-list-in-parts/description/

//
//        singly_list list=new singly_list();
//        list.insertFirstnotail(7);
//        list.insertFirstnotail(6);
//        list.insertFirstnotail(5);
//        list.insertFirstnotail(4);
//        list.insertFirstnotail(3);
//        list.insertFirstnotail(2);
//        list.insertFirstnotail(1);
//        list.displays();
//        list.displayListsplit(2,1,2);

// ------------------------------------------------------------------------------------------------------------
        // question:-https://leetcode.com/problems/split-linked-list-in-parts/description/

        singly_list list=new singly_list();
        list.insertFirstnotail(2);
        list.insertFirstnotail(1);
        list.insertFirstnotail(5);
        list.insertFirstnotail(2);
        list.insertFirstnotail(1);
        list.insertFirstnotail(3);
        list.insertFirstnotail(5);
        list.displays();

        list.minMax();
// ------------------------------------------------------------------------------------------------------------

    }




}
