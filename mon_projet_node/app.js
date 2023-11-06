const express = require('express');
const app = express();
const port = 3000; // Vous pouvez choisir n'importe quel port disponible

app.use(express.static(__dirname)); // Servir les fichiers statiques depuis le répertoire actuel

app.get('/', (req, res) => {
    res.sendFile(__dirname + 'C:\Users\pc\Documents\mon_projet_node');
});

app.listen(port, () => {
    console.log(`Le serveur fonctionne sur http://localhost:${port}`);
});