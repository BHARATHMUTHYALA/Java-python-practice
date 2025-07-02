class Main{
    public static void main(String args[]){
            Friend friend1 = new Friend("SPONGEBOB");
            Friend friend2 = new Friend("PATRICK");
            Friend friend3 = new Friend("Squidward");
            Friend friend4 = new Friend("Sanddy");
            Friend.displayFriends();
    }
}

class Friend{
    String name;
    static int noOfFriends;

    Friend(String name){
        this.name = name;
        noOfFriends+=1;
    }

    static void displayFriends(){
        System.out.println("You have "+noOfFriends+" friends");
    }
}