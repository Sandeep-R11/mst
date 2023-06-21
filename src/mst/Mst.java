/*
 import java.util.Scanner;
public class kruskalUnion
{
static int [] parent =new int [50];
static int [][]cost = new int [10][10];
static int a,b,i,j,u,v,n,min, noe=1, mincost=0;
static int find(int w)
{
while(parent[w] != 0)
w = parent[w];
return w;
}
static void union()
{
if(u != v)
{
noe++;
System.out.println(noe-1 + "Edge("+a+","+b+")="+min);
mincost += min;
parent[v] = u;
}
cost[a][b] = cost[b][a] = 999;
}
public static void main(String[] args)
{
Scanner read = new Scanner(System.in);
System.out.println("Enter the no. of vertices:");
n=read.nextInt();
System.out.println("Enter the cost adjacency matrix, 999 for no direct path:");
for(i = 1; i <= n; i++)
for(j=1; j<=n; j++)
cost[i][j]=read.nextInt();
while(noe < n)
{
min=999;
for(i=1; i<=n ; i++)
{
for(j=1; j<=n; j++)
{
if(cost[i][j] < min)
{
min = cost[i][j];
a = u = i;
b = v = j;
}
}
}
u = find(u);
v = find(v);
union();
}
System.out.println("minimum cost ="+mincost);
}
}


xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx

import java.util.*;
public class dijkstra
{
public static void main(String[] args)
{
int i, j;
int dist[]=new int[10], visited[]=new int[10];
int cost[][]=new int[10][10], path[]=new int[10];
Scanner in = new Scanner(System.in);
System.out.println("**** DIJKSTRA'S ALGORITHM ******");
System.out.println("Enter the number of nodes: ");
int n = in.nextInt();
System.out.println("Enter the cost matrix");
for(i=1;i<=n;i++)
for(j=1;j<=n;j++)
cost[i][j] = in.nextInt();
System.out.println("The entered cost matrix is");
for(i=1;i<=n;i++)
{
for(j=1;j<=n;j++)
{
System.out.print(cost[i][j]+"\t");
}
System.out.println();
}
System.out.println("Enter the source vertex: ");
int sv = in.nextInt();
dij(cost,dist,sv,n,path,visited);
printpath(sv,n,dist,path,visited );
System.out.println("\n********* *************** *********");
}
static void dij(int cost[][],int dist[],int sv,int n,int path[],int visited[])
{
int count = 2,min,v=0;
for(int i=1; i<=n; i++)
{
visited[i]=0;
dist[i] = cost[sv][i];
if(cost[sv][i] == 999)
path[i] = 0;
else
}
path[i] = sv;
visited[sv]=1;
while(count<=n)
{
min = 999;
for(int w=1; w<=n; w++)
if((dist[w]< min) && (visited[w]==0))
{
}
visited[v] = 1;
count++;
min = dist[w];
v = w;
for(int w=1; w<=n; w++)
{
if((dist[w]) >(dist[v] + cost[v][w]))
{
dist[w] = dist[v] + cost[v][w]; path[w] = v;
}
}
}
}
static void printpath(int sv,int n,int dist[],int path[], int visited[])
{
for(int w=1; w<=n; w++)
{
if(visited[w] == 1 && w != sv)
{
System.out.println("The shortest distance between ");
System.out.println(sv+"-> ="+w+" is :"+ dist[w]);
int t=path[w];
System.out.println("The path is:");
System.out.print(" "+w);
while(t != sv)
{
System.out.print("<-->"+t);
t=path[t];
}
System.out.print("<-->"+sv);
}
}
}
}
 */
