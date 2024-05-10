function obtenerPalabrasMasLargas(palabra, palabras) {
    return palabras.filter(p => p.length > palabra.length);
}

// Ejemplo de uso:
let palabra = "casa";
let palabras = ["perro", "gato", "elefante", "auto", "bicicleta"];

let palabrasMasLargas = obtenerPalabrasMasLargas(palabra, palabras);
console.log("Palabras más largas que '" + palabra + "':", palabrasMasLargas);