// Chloe Todd
// Sin 6

#include <stdio.h>

int main() {
    char user_input[50];

    printf("Enter a string: ");
    scanf("%s", user_input);

    // Incorrect:
    printf(user_input); // This is used directly, vulnerable

    // Correct:
    printf("\n%s was entered.\n", user_input);

    return 0;
}
