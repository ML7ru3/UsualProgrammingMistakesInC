#include <stdio.h>

void bufoverflow(){
    char buf[64];
    gets(buf);
    return;
}

int main() {
    bufoverflow();
}