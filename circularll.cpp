#include<iostream>
using namespace std;
struct node {
    int value;
    node *next;
};
class ll{
node *head , *tail;
public:
    ll(){
    head=NULL;
    tail=NULL;
    }
    void add(int x){
    node *new_node = new node;
    new_node->value=x;
    new_node->next=head;
    if(head==NULL){
        head=new_node;
        tail=new_node;
    }
    else{
        tail->next=new_node;
        tail=new_node;
    }
    }
    void display(){
    node *new_node;
    new_node=head;
    do{
        cout<<new_node->value<<" ";
        new_node=new_node->next;

    }while(new_node!=head);}
    void del(){
    node *temp=new node;
    temp=head;
    head=temp->next;
    temp->next=head;
    delete temp;

    }
    void Insert(int x){
    node *new_node = new node;
    new_node->value=x;
    new_node->next=head;
    head=new_node;
    tail->next=head;

    }
    void logic(node *previous){

    }
    int del_num(int num){
        node *previous,*ptr;
        previous=NULL;
        ptr=head;
        while(ptr!=NULL){
            if(ptr->value==num)
                logic(previous);
        previous=ptr;
        ptr=ptr->next;
        }
        if(ptr==NULL){
            cout<<"Sorry Element Not Found\n";
            return 0;
        }
        if(previous==NULL){
            del();
            ptr=head;
        }
        else{
        previous->next=ptr->next;
        ptr->next=NULL;
        delete ptr;

        }
    }

};
int main(){
ll a;
int n,b;
cout<<"\nEnter the length t\n";
cin>>n;
for(int i=0;i<n;i++){
    cin>>b;
    a.add(b);
}
a.display();
cout<<"\n1:- Insert Number at the beginning\n2:- Insert at end\n";
cin>>n;
if(n==1){
        cin>>n;
    a.Insert(n);
}
else if(n==2){
    cin>>n;
    a.add(n);
}
else{
    cout<<"Invalid";
}
a.display();
}


