#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int a, b, c;
    cin >> a >> b >> c;
    if (a < 1){
        cout << "Check input constraint";
    }else if (a > 1000){
        cout << "Check input constraint";
    }else if (b < 1){
        cout << "Check input constraint";
    }else if (b > 1000){
        cout << "Check input constraint";
    }else if (c < 1){
        cout << "Check input constraint";
    }else if (c > 1000){
        cout << "Check input constraint";
    }else{
        //cout << "The sum of the three numbers is " << a << " + " << b << " + " << c << " = " << a+b+c << ".";
        cout << a+b+c;
    }
    return 0;
}
