//
//  main.c
//  Bai 2
//
//  Created by Trần Cao Minh Bách on 6/28/20.
//  Copyright © 2020 Trần Cao Minh Bách. All rights reserved.
//

#include <stdio.h>
#include "stdlib.h"
#include "math.h"
#include "time.h"
#include "string.h"

void Menu(){
    printf("|---------------------- MENU ---------------------|\n");
    printf("|1. Nhập danh sách sinh viên                      |\n");
    printf("|2. Hiện thị danh sách sinh viên                  |\n");
    printf("|3. Sắp xếp danh sách theo chiều tăng mã sinh viên|\n");
    printf("|4. Tìm 1 sinh viên có mã nhập từ bàn phím        |\n");
    printf("|5. Xoá 1 sinh viên ra khỏi danh sách             |\n");
    printf("|6. Thoat                                         |\n");
    printf("|-------------------------------------------------|\n");
    printf("Chon: ");
}

typedef struct
{
    char hoten[20];
    int tuoi;
    float diem;
    int id;
} sv;

typedef struct node
{
    sv data;
    struct node* next;
} node;

node* first=NULL;

node* taoNode()
{
    node* pnode=(node*) malloc(sizeof(node));
    
    printf("Nhap ho ten: ");
    fflush(stdin);
    gets(pnode->data.hoten);
    printf("Nhap ma sv: ");
    scanf("%d",&pnode->data.id);
    printf("Nhap tuoi: ");
    scanf("%d",&pnode->data.tuoi);
    printf("Nhap diem: ");
    scanf("%f",&pnode->data.diem);
    
    pnode->next=NULL;
    return pnode;
}

void taoNodeDauTien()
{
    if (first==NULL) first=taoNode();
}

void taoNodeViTriCuoi()
{
    node* tmp;
    if (first==NULL) taoNodeDauTien();
    else
    {
        for (tmp=first; tmp->next!=NULL ; tmp=tmp->next);
        node* pnode=taoNode();
        tmp->next=pnode;
    }
    
}

void taoDS()
{
    char rep;
    while (1)
    {
        taoNodeViTriCuoi();
        printf("Nhap tiep(y/n)? ");
        fflush(stdin);
        rep = getchar();
        if (rep=='n' || rep=='N') {
            break;
        }
    }
}

void inDS()
{
    node* tmp;
    printf("\nHoTen\t\tTuoi\t\tDiem\n");
    for (tmp=first; tmp!=NULL; tmp=tmp->next)
    {
        printf("\n%s\t\t%d    \t\t%.2f\n\n",tmp->data.hoten,tmp->data.tuoi,tmp->data.diem);
    }
}

void timsv()
{
    char t[20];
    node* tmp;
    printf("Nhap ten can tim: ");
    fflush(stdin);
    gets(t);
    printf("\nHoTen\t\tTuoi\t\tDiem\n");
    for(tmp=first; tmp!=NULL; tmp=tmp->next)
    {
        if (strcmp(tmp->data.hoten,t)==0)
        {
            printf("\n%s\t\t%d\t\t%.2f",tmp->data.hoten,tmp->data.tuoi,tmp->data.diem);
        }
    }
}

void sxsv_theoten()
{
    node *t1, *t2;
    sv tmp;
    for(t1=first; t1!=NULL; t1=t1->next)
        for(t2=first; t2!=NULL; t2=t2->next)
        {
            if (strcmp(t1->data.hoten,t2->data.hoten)<0)
            {
                tmp=t1->data;
                t1->data=t2->data;
                t2->data=tmp;
            }
        }
}

void sxsv_theoid(){
    node *t1, *t2;
    sv tmp;
    for (t1=first; t1!=NULL; t1=t1->next) {
        for (t2=first; t2!=NULL; t2=t2->next) {
            if (t1->data.id == t2->data.id) {
                tmp = t1->data;
                t1->data = t2->data;
                t2->data = tmp;
            }
        }
    }
    
}

void xoasv()
{
    char t[20];
    node* tmp;
    printf("Nhap ten can tim: ");
    fflush(stdin);
    gets(t);
    if (strcmp(first->data.hoten,t)==0)
    {
        node* del=first;
        first=first->next;
        free(del);
    }
    else
        for(tmp=first; tmp!=NULL; tmp=tmp->next)
        {
            if (strcmp(tmp->data.hoten,t)==0)
            {
                
                node* del;
                del=tmp->next;
                tmp->next=del->next;
                free(del);
            }
        }
}

void xoacuoi()
{
    node* tmp;
    node* tmp2;
    for (tmp=first; tmp->next!=NULL; tmp=tmp->next);
    for (tmp2=first; tmp2->next!=tmp; tmp2=tmp2->next);
    tmp2->next=NULL;
    free(tmp);
}

int main()
{
    int chon = 0;
    
    while (1)
    {
        Menu();
        scanf("%d",&chon);
        switch (chon)
        {
            case 1 : taoDS();
                break;
            case 2 : inDS();
                break;
            case 3 : timsv();
                break;
            case 4 : sxsv_theoten();
                break;
            case 5 : xoasv();
                break;
            case 6: sxsv_theoid();
                break;
            case 7 : xoacuoi();
                return 0;
            default: printf("Nhap tu 1 den 7!");
                break;
        }
    }
}
