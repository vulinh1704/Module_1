class Store {
    listProduct;

    constructor() {
        this.listProduct = JSON.parse(localStorage.getItem("listProduct")); // Object
    }

    add(newProduct) {
        this.listProduct.push(newProduct);
        localStorage.setItem("listProduct", JSON.stringify(this.listProduct));
    }

    findAll() {
        this.listProduct = JSON.parse(localStorage.getItem("listProduct"));
        return this.listProduct;
    }

    remove(index) {
        this.listProduct.splice(index, 1);
        localStorage.setItem("listProduct", JSON.stringify(this.listProduct));
    }

    edit(index, newProduct) {
        this.listProduct[index] = newProduct;
        localStorage.setItem("listProduct", JSON.stringify(this.listProduct));
    }
}