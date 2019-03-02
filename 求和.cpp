#include<iostream>
using namespace std;

int f(int n){

	int sum = n;
	sum && (sum += f(sum-1));

	return sum;

}

int main(){
	int n;
	cin>>n;
	cout<<f(n)<<endl;

	return 0;
}