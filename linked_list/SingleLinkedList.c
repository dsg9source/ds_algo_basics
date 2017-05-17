#include<stdio.h>
#include<conio.h>
struct node{
       int n;
       struct node* next;
       
       
       };
struct node* insertAtBeg(int,struct node*);
main()
{
      struct node* p=NULL;
     p=(struct node *)insertAtBeg(7,p);
     p=(struct node *)insertAtBeg(8,p);
     p=(struct node *)insertAtBeg(9,p);
     p=(struct node *)insertAtBeg(10,p);
     p=(struct node *)insertAtBeg(12,p);
     struct node * k=p;
     while(k!=NULL)
     {
                   
          printf("k is %d",k->n); 
          k=k->next;       
                   
                   
                   }
                   
                   getch();
                   
       
}
struct node* insertAtBeg(int number,struct node* no)
{
    
    struct node* nxtode=(struct node*)malloc(sizeof(struct node));
    nxtode->n=number;
    nxtode->next=no;
    

             
    return nxtode;
}

struct node * insertAtEnd()
