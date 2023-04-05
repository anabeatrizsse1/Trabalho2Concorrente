#include <iostream>
#include <unistd.h>

/*=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
Autor....: Ana Beatriz Silva e Silva
Matrícula: 202110226
Inicio...: 15 de marco de 2021
Alteracao: 22 de marco de 2021
Nome.....: Principal.cpp
Funcao...: Exemplo do uso do comando fork em C++ com arvore geneologica.
=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=*/

using namespace std;
static pid_t pai, primeiroFilho, segundoFilho, terceiroFilho, primeiroNeto, segundoNeto, primeiroBisneto;
int cont = 0;

int main()
{
  cout << "******** Inicio da simulação ********" << endl;
  pai = getpid();
  while (true)
  {

    switch (cont)
    {

    case -1:
      exit(1);

    case 0:
      if (getpid() == pai)
      {

        cout << "\nNasce o pai com id:" << getpid() << "\n";
      }
      break;

    case 22:
      if (getpid() == pai)
      {
        primeiroFilho = fork();
        if (primeiroFilho == 0)
        {
          primeiroFilho = getpid();
          cout << "Nasceu o primeiro filho que possui como ID: " << getpid() << ", e o seu pai tem id: " << getppid() << "\n";
        }
      }
      break;

    case 25:
      if (getpid() == pai)
      {
        segundoFilho = fork();
        if (segundoFilho == 0)
        {

          segundoFilho = getpid();
          cout << " \nO pai teve o segundo filho que possui como ID: " << getpid() << ", e o seu pai tem id: " << getppid() << "\n";
        }
      }
      break;
    case 32:
      if (getpid() == pai)
      {
        terceiroFilho = fork();
        if (terceiroFilho == 0)
        {

          terceiroFilho = getpid();
          cout << " \nO pai teve seu terceiro filho que possui como ID: " << getpid() << ", e o seu pai tem id: " << getppid() << "\n";
        }
      }
      break;
    case 39:
      if (getpid() == primeiroFilho)
      {
        primeiroNeto = fork();
        if (primeiroNeto == 0)
        {

          primeiroNeto = getpid();
          cout << " \nO pai teve seu primeiro neto que possui como ID: " << getpid() << ", e o seu pai tem id: " << getppid() << "\n";
        }
      }
      break;
    case 46:
      if (getpid() == segundoFilho)
      {
        segundoNeto = fork();
        if (segundoNeto == 0)
        {

          segundoNeto = getpid();
          cout << " \nO pai teve seu segundo neto que possui como ID: " << getpid() << ", e o seu pai tem id: " << getppid() << "\n";
        }
      }
      break;
    case 69:
      if (getpid() == primeiroNeto)
      {
        primeiroBisneto = fork();
        if (primeiroBisneto == 0)
        {

          primeiroBisneto = getpid();
          cout << " \nO pai teve seu primeiro bisneto que possui como ID:" << getpid() << ", e o seu pai tem id: " << getppid() << "\n";
        }
      }
      break;

    // //incio das mortes
    case 73:
      if (getpid() == primeiroNeto)
      {
        cout << "Primeiro Neto morre " << endl;
        _exit(0);
      }
      break;
    case 78:
      if (getpid() == segundoNeto)
      {
        cout << "Segundo Neto morre " << endl;
        _exit(0);
      }
      break;
    case 80:
      if (getpid() == segundoFilho)
      {
        cout << "Segundo filho morre " << endl;
        _exit(0);
      }
      if (getpid() == primeiroBisneto)
      {
        cout << "Bisneto morre " << endl;
        _exit(0);
      }
      break;
    case 82:
      if (getpid() == primeiroFilho)
      {
        cout << "Primeiro filho morre " << endl;
        _exit(0);
      }
      break;
    case 87:
      if (getpid() == terceiroFilho)
      {
        cout << "Terceiro  filho morre " << endl;
        _exit(0);
      }
      break;
    case 90:
      if (getpid() == pai)
      {
        cout << "Pai morre " << endl;
        _exit(0);
      }
      break;

    } // fim do switch
    sleep(1);
    cont++;
  } // fim do while
  cout << " ******** fim ******** " << endl;
  return 0;

} // fim do main
