window.addEventListener("load",inicio);

function inicio(){
    document.getElementById("boton").addEventListener("click",cambiarTexto);
}
function cambiarTexto()
{
    document.getElementById("caja").innerHTML = "Es un sub-proyecto Spring que esta dirigido a facilitar y optimizar el proceso creacion de aplicaciones web utilizando el patron Modelo Vista Controlador, donde el Modelo representa los datos o informacion que manejara la aplicacion web, la Vista son todos los elementos de la Interfaz de Usuario, con ellos el usuario interactua con la aplicacion";  
}