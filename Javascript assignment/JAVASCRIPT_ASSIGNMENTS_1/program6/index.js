var x = "Hello,World,in,a,frame";

function rectangle(str)
{
    let arr =[];
    arr = str.split(",");
    for(let  index = 0; index < 1; index++)
    {
        document.write("*********");
        for(let j = 0; j <=arr.length; j++)
        {
            arr == arr[j].split(",");
            document.write("*" + arr[j] + "*");
        }
    }
    document.write("*********");
    return arr;
}

document.write(rectangle(x));