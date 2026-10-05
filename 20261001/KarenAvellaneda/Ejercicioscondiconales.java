# ==========================================
# EJERCICIO 1 - Saludar al usuario
# ==========================================

nombre = input("¿Cómo te llamas? ")
print("Buenos días", nombre)


# ==========================================
# EJERCICIO 2 - Área de un cuadrado
# Área = lado × lado
# ==========================================

lado = float(input("Introduce el lado del cuadrado: "))

area = lado * lado

print("El área del cuadrado es:", area)


# ==========================================
# EJERCICIO 3 - Suma, resta, producto y división
# ==========================================

numero1 = float(input("Introduce el primer número: "))
numero2 = float(input("Introduce el segundo número: "))

suma = numero1 + numero2
resta = numero1 - numero2
producto = numero1 * numero2
division = numero1 / numero2

print("Suma:", suma)
print("Resta:", resta)
print("Producto:", producto)
print("División:", division)


# ==========================================
# EJERCICIO 4 - Circunferencia y área del círculo
# Longitud = 2 × pi × radio
# Área = pi × radio²
# ==========================================

import math

radio = float(input("Introduce el radio: "))

longitud = 2 * math.pi * radio
area = math.pi * radio ** 2

print("Longitud de la circunferencia:", longitud)
print("Área del círculo:", area)


# ==========================================
# EJERCICIO 5 - Porcentaje de descuento
# ==========================================

precio_nominal = float(input("Introduce el precio original: "))
precio_venta = float(input("Introduce el precio de venta: "))

descuento = precio_nominal - precio_venta
porcentaje = (descuento / precio_nominal) * 100

print("El porcentaje de descuento es:", porcentaje, "%")


# ==========================================
# EJERCICIO 6 - Kelvin → Celsius → Fahrenheit
# ==========================================

kelvin = float(input("Introduce la temperatura en Kelvin: "))

celsius = kelvin - 273.15
fahrenheit = (celsius * 9 / 5) + 32

print("Temperatura en Celsius:", celsius)
print("Temperatura en Fahrenheit:", fahrenheit)


# ==========================================
# EJERCICIO 7 - Millas náuticas → metros
# 1 milla náutica = 1852 metros
# ==========================================

millas = float(input("Introduce las millas náuticas: "))

metros = millas * 1852
print("equivalente en metros;", metros);
