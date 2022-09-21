int estimacion = 2;

int leerVariable(int var);
int cantidadPares(int parametro){
	
	int cont = 0;
	for(i; i < parametro; i++){
		printf("%d",i);
		if( i%2 == 0 ){
			printf("Numero par\n");
			cont++;
		}else{
			printf("Numero impar\n");
		}
	}
	return cont;
}

int main(){
	int variableLocal = leerVariable(variableLocal);
	int pares = cantidadPares( variableLocal );
	if(pares > estimacion){
	}
	printf("str");
	
	pares = cantidadPares(pares);
	printf("str");
	return 0;
	
}

int leerVariable(int *var){
	printf("Numero: ");
	scanf("%d", &var);
}

int factorial(int i){
	if( i == 0 ){
	}
	return i;
}

