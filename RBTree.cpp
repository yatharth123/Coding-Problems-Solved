#include<iostream>
#include<cstdlib>
using namespace std;
struct Node{
	Node *p;
	Node *left;
	Node *right;
	int key;
	char color;
};
struct Tree{
	Node *root;
	int V;
};
struct Node* createNode(int key)
{
	Node* newNode = (struct Node*)malloc(sizeof(struct Node));
	newNode->key = key;
	newNode->p = NULL;
	newNode->left = NULL;
	newNode->right = NULL;
	newNode->color =' ';
	return newNode;
}

struct Tree* createTree(int V)
{
	Tree *T= (struct Tree*)malloc(sizeof(struct Tree));
	T->V = V;
	T->root = NULL;
	return T;
}
void insertinBST(Tree *T,Node* z)
{
	Node* y = NULL;
	Node* x = T->root;
	while(x!= NULL)
	{
		y = x;
		if((z->key)<(x->key))
			x = x->left;
		else
			x = x->right;	
	}
	z->p = y;
	if(y==NULL)
		T->root = z;
	else if((z->key)<(y->key))
		y->left = z;
	else
		y->right = z;
		
}
void left_rotate(Tree*, Node*);
void right_rotate(Tree*, Node*);
void insert_RB_Fixup(Tree *T, Node *z)
{
	Node* y;
	while((z->p!=NULL)&&z->p->color=='R')
	{
		if((z->p)==(z->p->p->left))
		{
			y = z->p->p->right;
			if(y->color=='R')
			{
				y->color = 'B';
				z->p->color = 'B';
				z->p->p->color = 'R';
				z = z->p->p;
			}
			else if(z==(z->p->right))
			{
				z = z->p;
				left_rotate(T,z);
			}
			else
			{
				z->p->color = 'B';
				z->p->p->color = 'R';
				right_rotate(T,z->p->p);
			}
			//y = NULL;
		}
		else
		{
			y = z->p->p->left;
			if((y!=NULL)&&y->color=='R')
			{
				y->color = 'B';
				z->p->color = 'B';
				z->p->p->color = 'R';
				z = z->p->p;
			}
			else if(z==(z->p->left))
			{
				z = z->p;
				right_rotate(T,z);
			}
			else
			{
				z->p->color = 'B';
				z->p->p->color = 'R';
				left_rotate(T,z->p->p);
			}
			//y = NULL;
		}
	}
	
	
	T->root->color = 'B';
}
void insertinRBTree(Tree *T,Node *z)
{
	insertinBST(T,z);
	z->color = 'R';
	insert_RB_Fixup(T,z);
}
void left_rotate(Tree *T,Node* x)
{
	Node* y = x->right;
	x->right = y->left;
	if((y->left)!=NULL)
	{
		y->left->p = x;
	}
	y->p = x->p;
	if((x->p)==NULL)
	{
		T->root = y;
	}
	else if(x==(x->p->left))
	{
		x->p->left = y;
	}
	else
	{
		x->p->right = y;
	}
	y->left = x;
	x->p = y;
}
void right_rotate(Tree *T,Node* x)
{
	Node* y = x->left;
	x->left = y->right;
	if((y->right)!=NULL)
	{
		y->right->p = x;
	}
	y->p = x->p;
	if((x->p)==NULL)
	{
		T->root = y;
	}
	else if(x==(x->p->right))
	{
		x->p->right = y;
	}
	else
	{
		x->p->left = y;
	}
	y->right = x;
	x->p = y;
}
int main()
{
	int V;
	
	cout<<"Enter the no. of elements in the tree"<<endl;
	cin>>V;
	Node *z;
	Tree *T = createTree(V);
	int *vertex = (int *)malloc(sizeof(int)*V);
	cout<<"Enter the vertices"<<endl;
	for(int i =0;i<V;i++)
	{
		cin>>vertex[i];
		z = createNode(vertex[i]);
		//insertinBST(T,z);
		insertinRBTree(T,z);
	}
	
	cout<<"The root of the tree is "<<(T->root->key)<<" and its color is "<<(T->root->color);
	
		
	return 0;
}
