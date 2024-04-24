// This is for sin 5 and shows how a buffer overflow can be avoided in C
#include <stdlib.h>
#include <stdio.h>
#include <string.h>

int main(){
    char username[10] = "";
    char is_admin[10] = "F";

    printf("Enter your secret username:\n");
    fgets(username, sizeof(username), stdin);

    
    printf("input: %s\n", username);
    printf("is admin: %s\n", is_admin);

    if(strcmp(is_admin, "T") == 0){
        printf("%s is admin:D\n", username);
    }
    else{
        printf("%s is not admind D:\n", username);
    }

    return 0;
}