#include <Javino.h>
Javino javino;

// SENSOR DE TEMPERATURA
int LM35 = A5;
// LUZ
int LDR = A0;
double temperature = 0;

void setup() {
  pinMode(LM35, INPUT);
  pinMode(LDR, INPUT);
  Serial.begin(9600);
}

void loop() {
  int light = analogRead(LDR);
  temperature = analogRead(LM35);
  
  char temperatureString[256];
  char lightString[128];

  dtostrf(temperature, 3,2, temperatureString);
  dtostrf(light, 3,2, lightString);

  strcat(temperatureString, " ");
  strcat(temperatureString,lightString);
  javino.sendmsg(temperatureString);
}

