#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <ctype.h>

// strlen - computes the length of a string, not including the terminating null character --> #include <string.h>
// isalnum - 
// strcspn - 

bool checkIfPalindrome(char *s) {
    int left = 0;
    int right = strlen(s) - 1;

    while (left < right)
    {
        if (tolower(s[left]) != tolower(s[right]))
        {
            return false;
        }
        else
        {
            left++;
            right--;
        }
    }
    return true;
}


int main() {
    char s[100];

    printf("Enter a string: ");
    fgets(s, sizeof(s), stdin);
    s[strcspn(s, "\n")] = 0;

    if (checkIfPalindrome(s)) {
        printf("The string '%s' is a palindrome.\n", s);
    } else {
        printf("The string '%s' is not a palindrome.\n", s);
    }

    return 0;
}