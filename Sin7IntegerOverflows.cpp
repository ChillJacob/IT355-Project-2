// Chloe Todd
// Sin 7

#include <iostream>

using namespace std;

long factorial (long n) {
    if (n == 0)
        return 1;
    else
        return n * factorial (n - 1);
}

int main() {
    int num = 4;

    long result = factorial((long)num); // casts to a long, just in case

    cout << "Factorial of " << num << " is: " << result << endl;
}
