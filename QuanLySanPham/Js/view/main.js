
// function main() {
//     let product = new Product(1, 'Bánh mì', 3, 100);
//     store.add(product);
//
//     let productsInStore = store.findAll();
//     for (let i = 0; i < productsInStore.length; i++) {
//         console.log(productsInStore[i])
//     }
//
//     store.remove(0);
//     console.log(store)
// }
// main();
let store = new Store();
function showAll() {
    let productsInStore = store.findAll();
    let str = ``;
    for (let i = 0; i < productsInStore.length; i++) {
        str += `
            <tr>
                <td>${productsInStore[i].id}</td>
                <td>${productsInStore[i].name}</td>
                <td>${productsInStore[i].quantity}</td>
                <td>${productsInStore[i].price}</td>
                <td><button style="background-color: #e77c7c" onclick="remove(${i})">Remove</button></td>
                <td><button style="background-color: green" onclick="showFormEdit(${i})">Edit</button></td>
            </tr>
        `
    }
    document.getElementById("products").innerHTML = str;
}

function showFormEdit(index) {
    let productsInStore = store.findAll();
    let productEdit = productsInStore[index];
    console.log(productEdit);
    document.getElementById('form-edit').innerHTML = `
       <center>
        <h1>Edit Product</h1>
        <table style="border: 1px solid black; margin-top: 50px">
            <tr>
                <td>Id</td>
                <td><input type="number" id="id" value="${productEdit.id}"></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" id="name" value="${productEdit.name}"></td>
            </tr>
            <tr>
                <td>Quantity</td>
                <td><input type="number" id="quantity" value="${productEdit.quantity}"></td>
            </tr>
            <tr>
                <td>Price</td>
                <td><input type="number" id="price" value="${productEdit.price}"></td>
            </tr>
            <tr>
                <th colspan="2"><button onclick="edit(${index})">Save</button></th>
            </tr>
        </table>
    </center> 
    `
}

function edit(index) {
    let id = document.getElementById('id').value;
    let name = document.getElementById('name').value;
    let quantity = document.getElementById('quantity').value;
    let price = document.getElementById('price').value;
    let newProductEdit = new Product(id, name, quantity, price);
    store.edit(index, newProductEdit);
    showAll();
    alert("Edit success")
    document.getElementById('form-edit').innerHTML = '';
}

function add() {
    let id = document.getElementById("id").value;
    let name = document.getElementById("name").value;
    let quantity = document.getElementById("quantity").value;
    let price = document.getElementById("price").value;
    let newProduct = new Product(id, name, quantity, price);
    store.add(newProduct);
    console.log(store);
    alert("Add Success");
    showAll();
    document.getElementById('form-add').innerHTML = '';
}

function showFormAdd() {
    document.getElementById('form-add').innerHTML = `
    <center>
        <h1>Add Product</h1>
        <table style="border: 1px solid black; margin-top: 50px">
            <tr>
                <td>Id</td>
                <td><input type="number" id="id"></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" id="name"></td>
            </tr>
            <tr>
                <td>Quantity</td>
                <td><input type="number" id="quantity"></td>
            </tr>
            <tr>
                <td>Price</td>
                <td><input type="number" id="price"></td>
            </tr>
            <tr>
                <th colspan="2"><button onclick="add()">Add</button></th>
            </tr>
        </table>
    </center>
    `
}

function remove(index) {
    let isConfirm = confirm("Bạn muốn xóa không ?")
    if (isConfirm) {
        store.remove(index);
        showAll();
    }
}


showAll();

// localStorage.setItem("listProduct", JSON.stringify([]));

