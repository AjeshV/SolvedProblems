#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */

    //Vector and variable initialization
    vector<int>v;
    int N,x;
    int i=0;

    cin >> N;
    
    if ((N>=1) && (N<=(pow(10,5)))){
        do{
            cin >> x;
            if((x>=1) && (x<=(pow(10,9)))){
                v.push_back(x);
                i++;
            }else{
                exit(0);
            }
        }while(i<N);

        sort(v.begin(),v.end());

        for (int j=0;j<N;j++){
            if(j!=(N-1))
                cout << v[j] << ' ';
            else
                cout << v[j];
        }
    }
}
