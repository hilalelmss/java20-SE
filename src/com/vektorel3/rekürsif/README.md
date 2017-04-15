
Baz� algoritmalar, do�alar� gere�i �zyinelidir. En �ok bilinen �zyineli algoritmalardan biri de fakt�ryel algoritmas�d�r. Matematikte n say�s�n�n fakt�ryeli,

n!=1.2.3 ..(n-1).n

�eklinde, 1�den n�e kadar tam say�lar�n �arp�m� �eklinde tan�mlan�r. Ayr�ca 0!=1 olarak tan�mlanm��t�r. �imdi yukar�daki ifadeyi,

n!=1.2.3....n=F(n)

�eklinde tan�mlarsak bu durumda,

(n-1)!=1.2.3...(n-1)=F(n-1)

olarak yaz�labilir. Buna g�re,

n!=1.2.3..n=F(n)=1.2.3...(n-1).n=F(n-1).n

ifadesine eri�ilecektir. Bu durumda,

F(n)=F(n-1).n

ifadesi �zyineli bir ifadedir; ��nk� F(n) fonksiyonunun tan�mlanmas� ve hesab�, fonksiyonun kendisine referans verilerek ger�ekle�tirilir.

�imdi, yukar�daki tan�mlamaya g�re hesaplaman�n nas�l yap�labilece�ine bakal�m. �rnek bir durum olarak, n=4 durumunu ele alal�m. B�ylece, n=4 i�in,

I.  F(4)=F(3).4

II.  F(3)=F(2).3

III.  F(2)=F(1).2

IV.  F(0)=F(0).1

ad�mlar� gerekecektir. F(0)=0!=1 olarak tan�ml� bir de�ere ula��ld���ndan, IV. ad�mda, F(1)=1 olarak hesaplanabilir. 

Sonra bir �nceki ad�ma ge�ilerek, F(2)=1.2 =2 olarak hesaplan�r.

Daha sonra II. ad�ma d�n�lecek ve F(3)=2.3=6 olarak hesaplan�r.

Sonu�ta ise I�e d�n�lerek F(4)=6.4=24 olarak 4! ifadesinin sonucu bulunacakt�r.

int fakt(int n)
{

    if(n<=1)
        return (1);
        
    else
        return (n*fakt(n-1));
        
}



FIBONACCI SAYILARININ �RET�LMES�

Fibonacci dizisi,

            1,1,2,3,5,8,13,21,34,55,89,144,233,..

�eklinde tan�mlanm�� bir sonsuz dizidir. Burada,

              F0=1   ve F1=1  al�narak

              F2=F0+F1

             F3=F1+F2

ve genel olarak

        Fi=Fi-1+Fi-2

�eklinde tan�mlan�r.



int fibon(int n)
{

    if(n==1 || n==2)
        return (1);
        
    else
        return (fibon(n-1)+fibon(n-2));
        
}